package domain;

import repositories.ClienteRepository;

public class ClienteTest {

        public static void main(String[] args) throws Exception{

        ClienteRepository clienteRepository = new ClienteRepository();

        Cliente  cliente = new Cliente();

        cliente.setCpf("39771451565");
        cliente.setEmail("guilherme@gmail.com");
        cliente.setFone("3232323232");
        cliente.setNome("Guilherme");

        clienteRepository.save(cliente);
    }
}
