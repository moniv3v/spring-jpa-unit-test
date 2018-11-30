package com.oocl.web.sampleWebApp.jpaSample;

import com.oocl.web.sampleWebApp.entity.SingleEntity;
import com.oocl.web.sampleWebApp.repository.SingleEntityRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

import static com.oocl.web.sampleWebApp.jpaSample.AssertHelper.assertThrows;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class SingleEntityTest {

    @Autowired
    private SingleEntityRepository singleEntityRepository;
    @Autowired
    private EntityManager entityManager;

    @Test
    public void save_and_fetch_entity(){
        final SingleEntity singleEntity = new SingleEntity();

        singleEntity.id = 1L;
        singleEntity.name = "ABC";

        singleEntityRepository.save(singleEntity);

        final SingleEntity fetched = singleEntityRepository.getOne(1L);

        assertEquals("ABC", fetched.name);
    }

    @Test
    public void should_not_store_to_database_if_length_exceed() {
        final SingleEntity singleEntity = new SingleEntity();
        singleEntity.id = 1L;
        singleEntity.name = "12345678901";
        assertThrows(Exception.class , () -> {
            singleEntityRepository.save(singleEntity);
            entityManager.flush();
        });

    }
}
