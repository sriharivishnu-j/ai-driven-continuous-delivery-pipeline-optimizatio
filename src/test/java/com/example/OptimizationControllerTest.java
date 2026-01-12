package com.example;

import com.example.controller.OptimizationController;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class OptimizationControllerTest {

    @Test
    public void testOptimizePipeline() {
        OptimizationController controller = new OptimizationController();
        String response = controller.optimizePipeline();
        assertThat(response).isEqualTo("Pipeline optimization triggered");
    }
}