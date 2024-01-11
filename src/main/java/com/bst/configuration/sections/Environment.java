package com.bst.configuration.sections;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
public class Environment {
  public String url;
  public String name;
  private List<String> users;

  @Value("${environment.isActiveDirectoryUser}")
  private static final HashMap<String, User> listOfUsers = new HashMap<>();

  public User getUser(String user) {
    return listOfUsers.get(user);
  }

  public void prepareUsers() {
    users.forEach(
        users -> {
          List<String> credentials = splitString(users);
          for (int i = 0; i < credentials.size(); i++) {
            User user = new User(credentials.get(i), credentials.get(++i));
            listOfUsers.put(user.username, user);
          }
        });
  }

  private List<String> splitString(String stringToSplit) {
    return Stream.of(stringToSplit.split("/")).map(String::new).collect(Collectors.toList());
  }
}
