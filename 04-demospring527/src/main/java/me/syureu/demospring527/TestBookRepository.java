package me.syureu.demospring527;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
//@Profile("test2")
@Profile("!test2 & test")
public class TestBookRepository implements BookRepository {
}
