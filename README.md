# My_Tasks (REST API)

## Pre-requisite

1. Java 18
1. Database:MySql
1. Maven
1. Spring boot project
1. Spring sequrity

##### create data and user using the following curl

   --curl --location --request GET 'http://localhost:8082/prepare/demo' \

The above curl will create
User-1: username=Akp, password=@123, role=ADMIN
User-2: username=userakp, password=123@, role=USER

## Sample Requests

1. Open Postman and select the request.
2. In the request details, go to the "Authorization" tab.
3. Choose "Basic Auth" as the type.
4. Enter the username and password in the respective fields.
5. Postman will automatically generate and include the correct Authorization header.

#### Create Project

--request POST 'http://localhost:8082/project' \
 --data-raw '{
"name": "Add Integration Tests"
}'

#### GET All Projects

--request GET 'http://localhost:8082/projects' \

#### Delete Project

--request DELETE 'http://localhost:8082/project/3' \

#### GET All Projects By User

##### Only accessible to ADMIN users

--request GET 'http://localhost:8082/projects/user/1' \

#### GET All Tasks By User

##### Only accessible to ADMIN users

--request GET 'http://localhost:8082/tasks/user/8' \

#### Create Task

--request POST 'http://localhost:8082/task' \
 --data-raw '{
"description": "Design Data Flow Diagram",
"status": "OPEN",
"project": {
"projectId": 100
},
"dueDate": "2021-01-31"
}'

#### Edit Task

--request PUT 'http://localhost:8082/task' \
 --data-raw '{
"taskId":102,
"description": "Navigation API Sequence Diagram Design",
"status": "closed",
"project": {
"projectId": 100
},
"dueDate": "2021-02-07"
}'

#### Get Task

--request GET 'http://localhost:8082/task/101' \

#### Get All Tasks By Project

--request GET 'http://localhost:8082/tasks/project/10' \

#### Get Expired Tasks

--request GET 'http://localhost:8082/tasks/expired' \

#### Get All Tasks By Status

--request GET 'http://localhost:8082/tasks/status/open' \

## Additional Requests

#### GET All Users

--request GET 'http://localhost:8082/users' \
