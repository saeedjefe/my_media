package org.example;

import systemic_linguistic_modeling.Entities;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


         enum BalanceBehavior {
            EQUILIBRIUM, DISEQUILIBRIUM,
            STABILITY, DISRUPTION,
            SUSTAINABILITY, UNSUSTAINABILITY,
            HOMEOSTASIS, DYSREGULATION
        }
        String gj = BalanceBehavior.EQUILIBRIUM.name();
        System.out.println(gj);
         enum ChangeBehavior {
            DYNAMICS, STATICS,
            ADAPTATION, RIGIDITY,
            RESILIENCE, VULNERABILITY,
            EMERGENCE, SUPPRESSION
        }

        enum IntegrationBehavior {
            COHESION, FRAGMENTATION,
            HOMOGENIZATION, HETEROGENIZATION,
            ASSIMILATION, PLURALISM
        }

        enum FeedbackBehavior {
            POSITIVE_FEEDBACK, NEGATIVE_FEEDBACK,
            REPOSITORY_GROWTH, RESOURCE_DEPLETION,
            REGULATION, DEREGULATION
        }

    }
}