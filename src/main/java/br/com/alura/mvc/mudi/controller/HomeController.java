package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("KOSPET Smart Watches of Men");
		pedido.setUrlProduto("https://www.amazon.com/KOSPET-Pressure-Activity-Waterproof-Android-BLACK/dp/B08RC2XRMN/ref=sr_1_2_sspa?keywords=activity%2Btracker%2Band%2Bsmart%2Bwatches&pd_rd_r=5748edff-c1fa-4554-91c8-9141575b9593&pd_rd_w=ZyrVk&pd_rd_wg=pRNE7&pf_rd_p=33f8f65b-b95c-44af-8b89-e59e69e79828&pf_rd_r=3MEGRRDH05WZH90KW9QB&qid=1654603949&sr=8-2-spons&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyMlkwQVJKSzk1Tko2JmVuY3J5cHRlZElkPUEwMTMzNjQ1QlowQlYyU0ZIOUw1JmVuY3J5cHRlZEFkSWQ9QTA3NDkwNjUzU0QwOTZIM05ZQjQmd2lkZ2V0TmFtZT1zcF9hdGYmYWN0aW9uPWNsaWNrUmVkaXJlY3QmZG9Ob3RMb2dDbGljaz10cnVl&th=1");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/71rDoKXN08L._AC_SX425_.jpg");
		pedido.setDescricao("uma descrição qualquer para o pedido");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
}
