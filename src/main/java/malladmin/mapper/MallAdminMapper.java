package malladmin.mapper;

import malladmin.dto.MallAdminDto;
import malladmin.entity.MallAdmin;

public class MallAdminMapper {
	
	public static MallAdminDto mapToMallAdminDto(MallAdmin malladmin) {
		return new MallAdminDto(
				malladmin.getAdminId(),
				malladmin.getUsername(),
				malladmin.getPassword(),
				malladmin.getEmail(),
				malladmin.getLastLoginTime()
	);
		
	}

	public static MallAdmin mapToMallAdmin(MallAdminDto malladminDto) {
		return new  MallAdmin(
				malladminDto.getAdminId(),
				malladminDto.getUsername(),
				malladminDto.getPassword(),
				malladminDto.getPhoneNumber(),
				malladminDto.getEmail(),
				malladminDto.getLastLoginTime()
			);
		
	}
}
