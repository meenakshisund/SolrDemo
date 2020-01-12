# SolrDemo

**Start solr using docker and create,retrieve documents using Spring Data Solr**

1. Start Docker in your machine.

**Execute either step 2 or step 3 (not both)**

2. Run the following commands:
  
    a) To start solr docker image with name "docker_solr_1" on port 8983 and exposing to localhost 8983
    
    b) To create a solr_core named "Student"
  ```bash
      docker run --name docker_solr_1 -d -p 8983:8983 -t solr
      docker exec -it --user=solr docker_solr_1 bin/solr create_core -c Student
  ```
3. If you want to make use of docker-compose.yml file, go to the path:
  ```bash 
  cd /<project_dir>/src/main/docker
  docker-compose up
  docker ps
  ```
  After starting solr in 8983 port, you can view solr UI - http://localhost:8983/solr
  
Take name of the docker image from "NAMES" section of the "docker ps" result. In my case, its "docker_solr_1"
To create a solr_core named "Student"
  ```bash
    docker exec -it --user=solr docker_solr_1 bin/solr create_core -c Student
  ```

4. Start the spring boot application
5. POST: "/create/student"
```json
{
	"id": "300",
	"age": 29,
	"salary": 160
}
```
5. You can view the indexed data under "Student" core - http://localhost:8983/solr


References:
	1. https://lucidworks.com/post/solr-on-docker-2/
