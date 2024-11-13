package net.departmentservice.DepartmentService.service.ServiceImpl;

import lombok.AllArgsConstructor;
import net.departmentservice.DepartmentService.dto.DepartDto;
import net.departmentservice.DepartmentService.entity.Depart;
import net.departmentservice.DepartmentService.repository.DepartRepository;
import net.departmentservice.DepartmentService.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartImpl implements DepartService {

    @Autowired
    private DepartRepository departRepository;
    @Override
    public DepartDto saveDepartment(DepartDto departmentDto) {

        Depart depart=new Depart(
                departmentDto.getDepartId(),
                departmentDto.getDepartName(),
                departmentDto.getDepartCode()
        );

        Depart savedepart=departRepository.save(depart);

        DepartDto departdto=new DepartDto(
                savedepart.getDepartId(),
                savedepart.getDepartName(),
                savedepart.getDepartCode()

        );
        return departdto;
    }

    @Override
    public DepartDto getBydepartCode(String departCode) {

        Depart depart1=departRepository.findBydepartCode(departCode);
        DepartDto getDepart=new DepartDto(
                depart1.getDepartId(),
                depart1.getDepartName(),
                depart1.getDepartCode()
        );
        return getDepart;
    }
}
