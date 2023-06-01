package com.example.TestAub;

import com.example.TestAub.controller.MainController;
import com.example.TestAub.model.dto.ProveedorDTO;
import com.example.TestAub.service.ProveedorService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;


import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
class TestAubApplicationTests {

	/*@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
	@Autowired*/

	@Mock
	private ProveedorService proveedorService;
	@InjectMocks
	private MainController mainController;

	private MockMvc mockMvc;

	@Test
	public void getsAllProveedorsSuccess() throws Exception {

		ProveedorDTO proveedorDTO = new ProveedorDTO( BigInteger.valueOf(1),"Coca-cola",BigInteger.valueOf(5));
		ProveedorDTO proveedorDTO1 = new ProveedorDTO( BigInteger.valueOf(2),"pepsi",BigInteger.valueOf(5));
		ProveedorDTO proveedorDTO2 = new ProveedorDTO( BigInteger.valueOf(3),"Redbull",BigInteger.valueOf(6));
		ProveedorDTO proveedorDTO3 = new ProveedorDTO( BigInteger.valueOf(4),"Fanta",BigInteger.valueOf(7));
		ProveedorDTO proveedorDTO4= new ProveedorDTO( BigInteger.valueOf(5),"Casera",BigInteger.valueOf(8));
		ProveedorDTO proveedorDTO5 = new ProveedorDTO( BigInteger.valueOf(6),"Trina",BigInteger.valueOf(6));

		List<ProveedorDTO> allProveedors = new ArrayList<>();

		allProveedors.add(proveedorDTO);
		allProveedors.add(proveedorDTO1);

		BigInteger id = BigInteger.valueOf(5);

		when(proveedorService.getListProveedorById(id)).thenReturn(new ResponseEntity<>(allProveedors, HttpStatus.OK));

		ResponseEntity<List<ProveedorDTO>> response = mainController.getListProveedorById(id);

		assertEquals(HttpStatus.OK, response.getStatusCode());

		assertEquals(allProveedors, response.getBody());
	}



}
