# Twitter Clone

**Author:** 

Jörg Oertel og Morten Feldt

***

**Things that are changed:**

UserUpdate class (added constructor to class)

```
public class UserUpdate {
    public String username;
    public String firstname; // if null, don't update
    public String lastname; // if null, don't update
    public String birthday; // if null, don't update

    public UserUpdate(String username, String firstname, String lastname, String birthday) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
    }
}
```
***

**Explenation about the REDIS data model:**

Create User:

```
{birthday=1951-03-03, firstname=Albert, numFollowing=0, passwordHash=aou87, lastname=Rumle, username=ahr, numFollowers=0}
```
Follow User:
```
{birthday=1951-03-03, firstname=Albert, numFollowing=1, passwordHash=aou87, username=ahr, numFollowers=0, lastname=Rumle}
```

