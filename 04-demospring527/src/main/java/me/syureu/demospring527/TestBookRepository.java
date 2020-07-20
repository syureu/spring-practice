package me.syureu.demospring527;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("test2")
public class TestBookRepository implements BookRepository {
}
