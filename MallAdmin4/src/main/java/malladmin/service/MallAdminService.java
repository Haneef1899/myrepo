package malladmin.service;

import java.util.List;

import malladmin.dto.MallAdminDto;

public interface MallAdminService {
  MallAdminDto createMallAdmin(MallAdminDto malladminDto);

  
  MallAdminDto getMallAdminById(Long AdminId);

  List<MallAdminDto> getAllMallAdmins();
}
