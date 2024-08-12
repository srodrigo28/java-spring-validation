package br.com.treinaweb.twprojects.web.projects.mappers;

import org.springframework.stereotype.Component;

import br.com.treinaweb.twprojects.core.models.Employee;
import br.com.treinaweb.twprojects.web.projects.dtos.ProjectTeamListItem;

@Component
public class ProjectTeamMapperImpl implements ProjectTeamMapper {

    @Override
    public ProjectTeamListItem toProjectTeamListItem(Employee employee) {
        return ProjectTeamListItem.builder()
            .name(employee.getName())
            .position(employee.getPosition().getName())
            .build();
    }
    
}
