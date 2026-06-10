# LinkedIn
* storing users
* can search for users in specific technology
* can search for years of experience in role
---
Functional requirements:
* The system can add a user to the LinkedIn platform.
* The system can check if a specific user exists.
* The system can search for users by technology.
* The system can search for users by role and minimum years of experience.

Design requirements:
* Users must be stored in a collection (List) of User.
* The class must validate input parameters (e.g., non-null users, valid search criteria).
* The class must not allow null users to be added.

# User
* name
* role
* stores job experiences
---
Functional requirements:
* The user can register with only a name (fresh graduate).
* The user can register with a name and role (first job).
* The user can register with a name, role, and job experiences (experienced user).
* The user can change their name later.
* The system can retrieve a specific user's name.
* The user can change their role later.
* The system can retrieve a specific user's role.
* The user can add a job experience.
* The system can view (in a non-modifiable way) a specific user's job experiences.
* The system can retrieve a specific user's total job experience in months.
* The system can determine if a user has a specific technology.

Design requirements:
* The user's name must be a String.
* The user's role must be a Role enum.
* The user's job experiences must be stored in a collection (List or Set).

# Job experience
* start date
* month spent there
* stores technologies
---
Functional requirements:
* The user can add a job experience with a start date, duration in months, and associated technologies (already filled position).
* The user can add a job experience with only a start date (new position).
* The system can retrieve the start date of a job experience.
* The system can retrieve the duration (in months) of a job experience.
* The system can retrieve the technologies used in a job experience.
* The user can set the duration (in months) of a job experience later.
* The user can get the duration (in months) of a job experience.
* The user can add a technology to a job experience later.

Design requirements:
* The start date must be represented as a date type (e.g., LocalDate).
* The duration must be represented as an integer (months).
* The technologies must be stored in a unique collection of Technology enum.

# Role
* frontend
* backend
* devops
* testauto
---
Functional requirements:
* The user must be able to set their role as one of the following: frontend, backend, devops, or testauto.

Design requirements:
* The Role must be represented as an enum.
* The name of the role must be uppercase.

# Technology
* React
* Java
* Docker
* Cucumber
---
Functional requirements:
* The user must be able to assign technologies such as React, Java, Docker, or Cucumber.

Design requirements:
* The Technology must be represented as an enum.
* The name of the technology must be uppercase.
