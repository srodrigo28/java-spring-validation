package br.com.treinaweb.twprojects.web.employees.mappers;

import org.springframework.stereotype.Component;

import br.com.treinaweb.twprojects.core.models.Project;
import br.com.treinaweb.twprojects.web.employees.dtos.EmployeeProjectListItem;

@Component
public class EmployeeProjectMapperImpl implements EmployeeProjectMapper {

    @Override
    public EmployeeProjectListItem toEmployeeProjectListItem(Project project) {
        return EmployeeProjectListItem.builder()
            .id(project.getId())
            .name(project.getName())
            .description(project.getDescription())
            .build();
    }
    
}
