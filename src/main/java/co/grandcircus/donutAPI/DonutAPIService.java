package co.grandcircus.donutAPI;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.donutAPI.entities.DetailResponse;
import co.grandcircus.donutAPI.entities.ResultsResponse;

@Component
public class DonutAPIService {

	private RestTemplate restTemplate;
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public ResultsResponse getResults() {

		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		ResultsResponse response = restTemplate.getForObject(url, ResultsResponse.class);
		System.out.println(response);
		return response;
	}

	public DetailResponse getDetails(Integer id) {

		String url = "https://grandcircusco.github.io/demo-apis/donuts/" + id + ".json";
		DetailResponse detailResponse = restTemplate.getForObject(url, DetailResponse.class);
		return detailResponse;
	}
}
