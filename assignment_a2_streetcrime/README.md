## Assignmet A2 Street Crimes Project

**Download a data set in a csv format and use (some of) the data to create a graph database.**

```
load csv from "file:///2021-02-wiltshire-street.csv" AS row
WITH row
WHERE row[0] IS NOT NULL
CREATE (cr:Crime {Id: row[0]})
MERGE (loc:Location {Street: row[6]})
MERGE (ty:Type {Type: row[9]})
CREATE (cr)-[a:RELTYPE]->(loc)
CREATE (cr)-[b:RELTYPE]->(ty)
```

**Which is the location with highest number of crimes?**

```
MATCH (a:Location)-[r:RELTYPE]-(b:Crime)
RETURN a, count(DISTINCT r) AS num
ORDER BY num DESC LIMIT 1
```

**Which is the most common crime?**

```
MATCH (a:Type)-[r:RELTYPE]-()
RETURN a, count(DISTINCT r) AS num
ORDER BY num DESC LIMIT 1
```