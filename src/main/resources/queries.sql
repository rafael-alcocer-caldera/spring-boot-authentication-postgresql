INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');


INSERT INTO users(email, username, "password") VALUES('admin@admin.com', 'admin', '$2a$10$iERtlO0Q.Dn8qX5fv/eIROdZDFMXCDZAy2R7TUcWXYVojtlYNGf0i');
INSERT INTO users(email, username, "password") VALUES('user1@user1.com', 'user1', '$2a$10$06bMDbkmPcixDpp4BsnB.usGNgJJQzWmSvYSgbDhPCGFa3Lcpnl4i');
INSERT INTO users(email, username, "password") VALUES('user2@user2.com', 'user2', '$2a$10$bVv4Z0PVauPKJNuK44y6YO.GLQzSMAj7YkyWnAK9CNJGQHmeQZrEC');
INSERT INTO users(email, username, "password") VALUES('mod@mod.com', 'mod', '$2a$10$hAvV5OaSAT1lhVR3vnV8KOohS2vnnD4yZV9Jh.lEtKgVD2iGEaiwm');


INSERT INTO user_roles (user_id, role_id) VALUES(1, 3);
INSERT INTO user_roles(user_id, role_id) VALUES(2, 1);
INSERT INTO user_roles(user_id, role_id) VALUES(3, 1);
INSERT INTO user_roles(user_id, role_id) VALUES(4, 2);


/* 
 * admin: $2a$10$iERtlO0Q.Dn8qX5fv/eIROdZDFMXCDZAy2R7TUcWXYVojtlYNGf0i
 * user1: $2a$10$06bMDbkmPcixDpp4BsnB.usGNgJJQzWmSvYSgbDhPCGFa3Lcpnl4i
 * user2: $2a$10$bVv4Z0PVauPKJNuK44y6YO.GLQzSMAj7YkyWnAK9CNJGQHmeQZrEC
 * mod: $2a$10$hAvV5OaSAT1lhVR3vnV8KOohS2vnnD4yZV9Jh.lEtKgVD2iGEaiwm
 * 
 *
 */


UPDATE users 
SET "email" = 'admin@admin.com', "username" = 'admin', "password" = '$2a$10$iERtlO0Q.Dn8qX5fv/eIROdZDFMXCDZAy2R7TUcWXYVojtlYNGf0i'
WHERE id = 1;

UPDATE users 
SET "email" = 'user1@user1.com', "username" = 'user1', "password" = '$2a$10$06bMDbkmPcixDpp4BsnB.usGNgJJQzWmSvYSgbDhPCGFa3Lcpnl4i'
WHERE id = 2;

UPDATE users 
SET "email" = 'user2@user2.com', "username" = 'user2', "password" = '$2a$10$bVv4Z0PVauPKJNuK44y6YO.GLQzSMAj7YkyWnAK9CNJGQHmeQZrEC'
WHERE id = 3;

UPDATE users 
SET "email" = 'mod@mod.com', "username" = 'mod', "password" = '$2a$10$hAvV5OaSAT1lhVR3vnV8KOohS2vnnD4yZV9Jh.lEtKgVD2iGEaiwm'
WHERE id = 4;
