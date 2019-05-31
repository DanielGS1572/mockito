package com.daniel.business;

import com.daniel.data.api.TodoService;
import com.daniel.data.api.TodoServiceStub;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.Assert.assertEquals;

public class MockTest {
    @Test
    public void test() {
        TodoService todoService = mock(TodoService.class);
        List<String> allTodos = Arrays.asList("Learn Spring MVC",
                "Learn Spring", "Learn to Dance"/*,"Spring"*/);
        when(todoService.retrieveTodos("Dummy")).thenReturn(allTodos);
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);

        List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");        //Con esto se hace llamar el when
        System.out.println(todos.size());

        assertEquals(2, todos.size());
    }
}
