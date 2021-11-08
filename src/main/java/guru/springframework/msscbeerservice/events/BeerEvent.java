package guru.springframework.msscbeerservice.events;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor // Jackson needs @NoArgsConstructor
public class BeerEvent implements Serializable {

    static final long serialVersionUID = 1264966371619492819L;

    private BeerDto beerDto;
}
