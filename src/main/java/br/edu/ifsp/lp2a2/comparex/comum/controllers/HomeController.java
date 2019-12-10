package br.edu.ifsp.lp2a2.comparex.comum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.ifsp.lp2a2.comparex.comum.model.entidades.LojasProdutosRepository;
import br.edu.ifsp.lp2a2.comparex.comum.model.entidades.ProdutosRespository;
/*import br.edu.ifsp.lp2a2.comparex.comum.services.ComparadorProdutosService;*/

@Controller
public class HomeController {
    
private ProdutosRespository produtosRepository;
private LojasProdutosRepository lojasProdutosRepository;
	
    public HomeController(ProdutosRespository produtosRepository, LojasProdutosRepository lojasProdutosRepository){
		this.produtosRepository = produtosRepository;
		this.lojasProdutosRepository = lojasProdutosRepository;
    }
   
    @GetMapping("/")
	public String index(Model model) {
		/*model.addAttribute("produtos", repository.findAll()); */
		return "comum/index";
	}

   @GetMapping(value = "/search", params = {"pesquisar"})
   public String resultado(Model model, String pesquisar) {
		model.addAttribute("produtos", produtosRepository.findByNomeContaining(pesquisar));
		model.addAttribute("precos", lojasProdutosRepository.menorPreco());
		model.addAttribute("quantidades", lojasProdutosRepository.quantidadeLojas());
		return "comum/resultado";
	}
}