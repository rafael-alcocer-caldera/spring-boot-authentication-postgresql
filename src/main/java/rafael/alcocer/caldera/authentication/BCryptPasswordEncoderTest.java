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
package rafael.alcocer.caldera.authentication;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderTest {

    public static void main(String[] args) {
        BCryptPasswordEncoderTest x = new BCryptPasswordEncoderTest();
        x.go();
    }

    public void go() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode("admin");
        System.out.println("##### encodedPassword: " + encodedPassword);
        // admin: $2a$10$iERtlO0Q.Dn8qX5fv/eIROdZDFMXCDZAy2R7TUcWXYVojtlYNGf0i
        // user1: $2a$10$06bMDbkmPcixDpp4BsnB.usGNgJJQzWmSvYSgbDhPCGFa3Lcpnl4i
        // user2: $2a$10$bVv4Z0PVauPKJNuK44y6YO.GLQzSMAj7YkyWnAK9CNJGQHmeQZrEC
        // mod: $2a$10$hAvV5OaSAT1lhVR3vnV8KOohS2vnnD4yZV9Jh.lEtKgVD2iGEaiwm

        boolean isOK = passwordEncoder.matches("admin", "$2a$10$iERtlO0Q.Dn8qX5fv/eIROdZDFMXCDZAy2R7TUcWXYVojtlYNGf0i");
        System.out.println("##### isOK: " + isOK);
    }
}
