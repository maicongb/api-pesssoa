package pm.apipessoa.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pm.apipessoa.api.model.PessoaModel;
import pm.apipessoa.domain.model.Pessoa;

@Component
public class PessoaModelAssembler {

	@Autowired
	private ModelMapper modelMapper;
	
	public PessoaModel toModel(Pessoa pessoa) {
		
		return modelMapper.map(pessoa, PessoaModel.class);
	}
	
}