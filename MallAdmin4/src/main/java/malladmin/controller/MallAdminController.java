package malladmin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import lombok.AllArgsConstructor;
import malladmin.dto.MallAdminDto;
import malladmin.service.MallAdminService;
@AllArgsConstructor
@RestController
@RequestMapping("/api/malladmin")

public class MallAdminController {
	@Autowired
	private MallAdminService malladminService;
	
	// BUILD ADD EMPLOYEE REST API
	
	@PostMapping
	public ResponseEntity<MallAdminDto> createMallAdmin(@RequestBody MallAdminDto malladminDto){
	
		MallAdminDto savedMallAdmin=malladminService.createMallAdmin(malladminDto);
		
		return new ResponseEntity<>(savedMallAdmin,HttpStatus.CREATED);
	}
	

	//Build Get MallAdmin REST API
	@GetMapping("{id}")
	public ResponseEntity<MallAdminDto> getMallAdminById(@PathVariable("id")Long adminId){
		MallAdminDto malladminDto=malladminService.getMallAdminById(adminId);
		return ResponseEntity.ok(malladminDto);
	}
	
	//build get all admins rest api
	@GetMapping
	public ResponseEntity<List<MallAdminDto>> getAllMallAdmins(){
		List<MallAdminDto> malladmins= malladminService.getAllMallAdmins();
		return ResponseEntity.ok(malladmins);
	}
}
