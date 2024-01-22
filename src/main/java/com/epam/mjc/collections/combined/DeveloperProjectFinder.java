package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectNames = new ArrayList<>();

        for (Map.Entry<String, Set<String>> e: projects.entrySet()) {
            if (e.getValue().contains(developer)) {
                projectNames.add(e.getKey());
            }
        }

        if (!projectNames.isEmpty()) {
            projectNames.sort(Comparator.reverseOrder());
            projectNames.sort(Comparator.comparing(String::length).reversed());
        }

        return projectNames;
    }
}
