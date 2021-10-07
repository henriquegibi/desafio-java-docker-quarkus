package click.henriquegibi.desafiojavadockerquarkus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cotardolar")
public class DolarAmericano
{
	@GetMapping
	public String cotar()
	{
		return "Hello World";
	}
	
	//public static String getURLBase() 				{		return URLBase;		}
	//public static void setURLBase(String uRLBase) 	{		URLBase = uRLBase;	}

	//private static String URLBase = "https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/aplicacao#!/CotacaoDolarDia";
	
	//private static DolarAmericano instance;
	
}