package controllers;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.SoftwareProyect;

public class ProjectController {
    public Set<SoftwareProject> filterAndOrderProjects(List<SoftwareProyect> projects, double minimumWorkload) {
        TreeSet<SoftwareProyect> treeSetOrdenado = new TreeSet<>();
        
        @Override
        public int compare(SoftwareProyect otro) {
            if(projects.getMetrics().getWorkload() == otro.getMetrics().getWorkload() && projects.projectCode().compareToIgnoreCase(otro)) {
                return 0;
            }

            if(projects.getMetrics(getWorkload()) != otro.getMetrics(getWorkload())) {
                return Integer.compareToIgnoreCase(otro.getMetrics(getWorkload()), otro.getMetrics(getWorkload()));
            }

            return projects.getProyectCode().compareTo(otro.equals(otro.projectCode));
        }
        


        TreeSet<SoftwareProyect> trabajoDescendente = TreeSet<>();
        TreeSet<SoftwareProyect> trabajoAscendente = TreeSet<>();

        for (SoftwareProyect project : projects) {
            if (project.getMetrics().getWorkload() >= minimumWorkload) {
                trabajoAscendente.add(project);
            } else {
                trabajoDescendente.add(project);
            }
        }
        
        treeSetOrdenado.add(trabajoAscendente);

        return treeSetOrdenado;

    }

    public List<SoftwareProject> classifyAndExtractProjects(List<SoftwareProyect> projects, String requestedCategory) {
        
    }
}
