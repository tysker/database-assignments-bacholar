# Neo4j Cluster Application

**Authors:** Jörg Oertel, Morten Feldt

## Task 1: Create a cluster of minimum three Neo4j servers and two replicas

***

### Create 3 cluster

[Link for cluster tutorial](https://neo4j.com/docs/operations-manual/current/tutorial/local-causal-cluster/#tutorial-local-cluster)

Start each cluster with following command:

```
bin/neo4j start
```

To see the status or to stop the server:

```
bin/neo4j status
bin/neo4j stop
```

To see the log files:

```
Linux and MacOS:
tail -n100 logs/neo4j.log
Windows: 
Get-Content .\logs\neo4j.log -Tail 10 -Wait
```

Check the status of the cluster by running the following in Neo4j Browser:

```
:sysinfo
```

<img src="./images/cluster.png" alt="cluster" width="60%" height="60%">

***

Click on the links below to start the servers

- [Link for cluster 1](http://localhost:7474/browser/)
- [Link for cluster 2](http://localhost:7475/browser/)
- [Link for cluster 3](http://localhost:7476/browser/)

Use following login credentials (same for replicas):

**database:** leave empty

**username:** neo4j

**password:** 1234

***
### Create 2 replicas

<img src="./images/replica.png" alt="cluster" width="60%" height="60%">

Check the status of the cluster by running the following in Neo4j Browser:

```
:sysinfo
```

- [Link for replica 1](http://localhost:7477/browser/)
- [Link for replica 2](http://localhost:7478/browser/)

***

[Link til Recipes Guide](https://neo4j.com/graphgist/dd3dedcf-c377-4575-84f4-4d0d30b2a4c5)