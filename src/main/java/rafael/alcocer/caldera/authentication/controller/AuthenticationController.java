/**
 * Copyright [2022] [RAFAEL ALCOCER CALDERA]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rafael.alcocer.caldera.authentication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import rafael.alcocer.caldera.authentication.payload.request.AuthenticationRequest;
import rafael.alcocer.caldera.authentication.services.UserDetailsServiceImpl;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    private final UserDetailsServiceImpl userDetailsService;
    private final BCryptPasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthenticationRequest loginRequest) {
        System.out.println("##### LoginController... username: " + loginRequest.getUsername());
        System.out.println("##### LoginController... password: " + loginRequest.getPassword());

        UserDetails userDetails = userDetailsService.loadUserByUsername(loginRequest.getUsername());
        System.out.println("##### userDetails.getUsername(): " + userDetails.getUsername());
        System.out.println("##### userDetails.getPassword(): " + userDetails.getPassword());
        System.out.println("##### userDetails.getAuthorities(): " + userDetails.getAuthorities());

        if (passwordEncoder.matches(loginRequest.getPassword(), userDetails.getPassword())) {
            // correct!
            System.out.println("##### CORRECT PASSWORD...");
            return new ResponseEntity<>(userDetails, HttpStatus.OK);
        } else {
            // bad login!
            System.out.println("##### INCORRECT PASSWORD...");
            return new ResponseEntity<>("{\n    \"message\":\n    \"INCORRECT PASSWORD, but you must not say this... what I put here is for didactic purposes...\"\n}", HttpStatus.UNAUTHORIZED);
        }
    }
}
