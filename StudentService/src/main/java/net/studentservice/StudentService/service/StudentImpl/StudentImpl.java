package net.studentservice.StudentService.service.StudentImpl;

import lombok.AllArgsConstructor;
import net.studentservice.StudentService.dto.APIResponseDto;
import net.studentservice.StudentService.dto.DepartDto;
import net.studentservice.StudentService.dto.StudentDto;
import net.studentservice.StudentService.entity.Students;
import net.studentservice.StudentService.repository.StudentRepository;
import net.studentservice.StudentService.service.APIClient;
import net.studentservice.StudentService.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@AllArgsConstructor
public class StudentImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

//    @Autowired
//    private RestTemplate restTemplate;

//    private WebClient webClient;

    private APIClient apiClient;

    @Override
    public StudentDto savestudents(StudentDto studentDto) {

        Students student=new Students(
                studentDto.getStudentId(),
                studentDto.getStudentName(),
                studentDto.getStudentdepart(),
                studentDto.getDepartCode()
        );

        Students savedstudent=studentRepository.save(student);
        StudentDto studentDto1=new StudentDto(
                savedstudent.getStudentId(),
                savedstudent.getStudentName(),
                savedstudent.getStudentdepart(),
                savedstudent.getDepartCode()
        );
        return studentDto1;
    }


    @Override
    public APIResponseDto getstudentById(Long studentId) {

        Students stu=studentRepository.findBystudentId(studentId);

//    ResponseEntity<DepartDto> responseEntity=restTemplate.getForEntity("http://localhost:9906/api/departs/" +stu.getDepartCode(), DepartDto.class);
//    DepartDto departDto=responseEntity.getBody();

//    DepartDto departDto= webClient.get()
//                .uri("http://localhost:9906/api/departs/" + stu.getDepartCode())
//                .retrieve()
//                .bodyToMono(DepartDto.class)
//                .block();

       DepartDto departDto= apiClient.getByDepartCode(stu.getDepartCode());

        StudentDto studentDto=new StudentDto(
                stu.getStudentId(),
                stu.getStudentName(),
                stu.getStudentdepart(),
                stu.getDepartCode()
        );

        APIResponseDto apiResponseDto=new APIResponseDto();
        apiResponseDto.setStudentDto(studentDto);
        apiResponseDto.setDepartDto(departDto);
        return apiResponseDto;
    }
}
