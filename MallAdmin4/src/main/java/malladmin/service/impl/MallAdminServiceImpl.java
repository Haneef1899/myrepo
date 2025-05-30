package malladmin.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import malladmin.dto.MallAdminDto;
import malladmin.entity.MallAdmin;
import malladmin.exception.ResourceNotFoundException;
import malladmin.mapper.MallAdminMapper;
import malladmin.repository.MallAdminRepository;
import malladmin.service.MallAdminService;


@Service
@AllArgsConstructor
public class MallAdminServiceImpl implements MallAdminService {
     private MallAdminRepository malladminRepository;

	@Override
	public MallAdminDto createMallAdmin(MallAdminDto malladminDto) {
		MallAdmin malladmin=MallAdminMapper.mapToMallAdmin(malladminDto);
		MallAdmin savedMalladmin=malladminRepository.save(malladmin);
		return MallAdminMapper.mapToMallAdminDto(savedMalladmin);
	}

	@Override
	public MallAdminDto getMallAdminById(Long adminId) {
		// TODO Auto-generated method stub
		
		MallAdmin malladmin=malladminRepository.findById(adminId)
		.orElseThrow(() ->
		  new ResourceNotFoundException("Employee not exist" + adminId));
		return MallAdminMapper.mapToMallAdminDto(malladmin);
	}

	@Override
	public List<MallAdminDto> getAllMallAdmins() {
		List<MallAdmin> malladmin=malladminRepository.findAll();
		return malladmin.stream().map((malladmins) -> MallAdminMapper.mapToMallAdminDto(malladmins))
				.collect(Collectors.toList());
	}
	
}
