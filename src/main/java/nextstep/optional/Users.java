package nextstep.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Users {
    static final User DEFAULT_USER = new User("codesquad", 100);

    List<User> users = Arrays.asList(
            new User("crong", 35),
            new User("pobi", 30),
            new User("jk", 40),
            new User("honux", 45),
            null
    );

    User getUser(String name) {

        List<Optional<User>> optionalList = users.stream()
                .map(user -> Optional.ofNullable(user))
                .collect(Collectors.toList());

        List<User> userList = optionalList.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());


        return userList.stream()
                .filter(user -> user.matchName(name))
                .findFirst()
                .orElse(DEFAULT_USER);
    }
}
