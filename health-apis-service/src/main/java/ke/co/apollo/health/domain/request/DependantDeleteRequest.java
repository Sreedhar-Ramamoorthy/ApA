package ke.co.apollo.health.domain.request;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DependantDeleteRequest {

  @NotNull
  private String customerId;

  private String agentId;

  private String quoteId;

}
