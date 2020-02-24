package com.general.inventory.rest.service;

import com.general.inventory.data.entity.Category;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
public class CategoryServiceTest{

    @InjectMocks
    private CategoryService categoryService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllCategories(){
      /*  List<Category> categoryList = categoryService.getAll();
        assertThat(categoryList.size(), is(greaterThanOrEqualTo(0)));*/
    }

    @Test
    public void testGetCategoryById(){
    /*    Optional<Category> category=categoryService.getById("001");
        boolean isPresent=category.isPresent();
        assertTrue(isPresent);
        assertThat(category.get().getId(),is("001"));*/
    }
}
