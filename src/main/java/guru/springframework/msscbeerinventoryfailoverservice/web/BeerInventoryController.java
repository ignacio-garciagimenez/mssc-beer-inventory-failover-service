package guru.springframework.msscbeerinventoryfailoverservice.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/inventory-failover")
public class BeerInventoryController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BeerInventoryDto> listBeersById(){

        BeerInventoryDto dto = BeerInventoryDto.builder()
                .beerId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                .id(UUID.randomUUID())
                .quantityOnHand(999)
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .build();

        List<BeerInventoryDto> responseData = new ArrayList<BeerInventoryDto>();
        responseData.add(dto);

        return responseData;
    }
}
