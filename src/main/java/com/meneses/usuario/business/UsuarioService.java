package com.meneses.usuario.business;

import com.meneses.usuario.business.converter.UsuarioConverter;
import com.meneses.usuario.business.dto.UsuarioDTO;
import com.meneses.usuario.infrastructure.entity.Usuario;
import com.meneses.usuario.infrastructure.repositure.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }


}
