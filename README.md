# SPRING BOOT AUTHENTICATION POSTGRESQL

## Synopsis

The project is a Spring Boot Application for Authentication using PostgresQL as a Database. 

## Motivation

I wanted to do an authentication service.

## Pre Requirements

- You need PostgresQL installed
- When you start the application it creates the database, after this you need to execute the queries that are in the queries.sql within the resource folder


USING POSTMAN:
--------------

ADMIN USER
----------
POST
http://localhost:8180/api/auth/login

Body
----
```json
{
    "username": "admin",
    "password": "admin"
}
```

Response:
---------
```json
{
    "id": 1,
    "username": "admin",
    "email": "admin@admin.com",
    "authorities": [
        {
            "authority": "ROLE_ADMIN"
        }
    ],
    "enabled": true,
    "accountNonExpired": true,
    "credentialsNonExpired": true,
    "accountNonLocked": true
}
```

Eclipse Console:
----------------

&#35;&#35;&#35;&#35;&#35; LoginController... username: admin

&#35;&#35;&#35;&#35;&#35; LoginController... password: admin

&#35;&#35;&#35;&#35;&#35; userDetails.getUsername(): admin

&#35;&#35;&#35;&#35;&#35; userDetails.getPassword(): $2a$10$iERtlO0Q.Dn8qX5fv/eIROdZDFMXCDZAy2R7TUcWXYVojtlYNGf0i

&#35;&#35;&#35;&#35;&#35; userDetails.getAuthorities(): [ROLE_ADMIN]

&#35;&#35;&#35;&#35;&#35; CORRECT PASSWORD...


MOD USER
--------
POST
http://localhost:8180/api/auth/login

Body
----
```json
{
    "username": "mod",
    "password": "mod"
}
```

Response:
---------
```json
{
    "id": 4,
    "username": "mod",
    "email": "mod@mod.com",
    "authorities": [
        {
            "authority": "ROLE_MODERATOR"
        }
    ],
    "enabled": true,
    "accountNonExpired": true,
    "credentialsNonExpired": true,
    "accountNonLocked": true
}
```

Eclipse Console:
----------------
&#35;&#35;&#35;&#35;&#35; LoginController... username: mod

&#35;&#35;&#35;&#35;&#35; LoginController... password: mod

&#35;&#35;&#35;&#35;&#35; userDetails.getUsername(): mod

&#35;&#35;&#35;&#35;&#35; userDetails.getPassword(): $2a$10$hAvV5OaSAT1lhVR3vnV8KOohS2vnnD4yZV9Jh.lEtKgVD2iGEaiwm

&#35;&#35;&#35;&#35;&#35; userDetails.getAuthorities(): [ROLE_MODERATOR]

&#35;&#35;&#35;&#35;&#35; CORRECT PASSWORD...



## License

All work is under Apache 2.0 license