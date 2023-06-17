package com.bhrhgh.calculatorwebapp.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.ui.Model;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private Model model;

    @Test
    public void testShowCalculatorPage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("calculatorForm"));
    }


    @Test
    public void testCalculateAddition() throws Exception {
        when(model.addAttribute(anyString(), anyInt())).thenReturn(model);
        mockMvc.perform(MockMvcRequestBuilders.post("/calculate")
                .param("num1", "5")
                .param("num2", "3")
                .param("operation", "add"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("result"))
                .andExpect(MockMvcResultMatchers.model().attribute("result", 8));
    }

    @Test
    public void testCalculateSubtraction() throws Exception {
        when(model.addAttribute(anyString(), anyInt())).thenReturn(model);
        mockMvc.perform(MockMvcRequestBuilders.post("/calculate")
                .param("num1", "5")
                .param("num2", "3")
                .param("operation", "subtract"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("result"))
                .andExpect(MockMvcResultMatchers.model().attribute("result", 2));
    }

    @Test
    public void testCalculateMultiplication() throws Exception {
        when(model.addAttribute(anyString(), anyInt())).thenReturn(model);
        mockMvc.perform(MockMvcRequestBuilders.post("/calculate")
                .param("num1", "5")
                .param("num2", "3")
                .param("operation", "multiply"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("result"))
                .andExpect(MockMvcResultMatchers.model().attribute("result", 15));
    }

    @Test
    public void testCalculateDivision() throws Exception {
        when(model.addAttribute(anyString(), anyInt())).thenReturn(model);
        mockMvc.perform(MockMvcRequestBuilders.post("/calculate")
                .param("num1", "6")
                .param("num2", "3")
                .param("operation", "divide"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("result"))
                .andExpect(MockMvcResultMatchers.model().attribute("result", 2));
    }
}
