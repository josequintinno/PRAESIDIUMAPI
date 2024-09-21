package br.com.quintinno.praesidiumapi.repository;

import org.springframework.stereotype.Repository;

import br.com.quintinno.praesidiumapi.entity.UsuarioEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class UsuarioImplementacaoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public UsuarioEntity recuperarUsuario(String identificador) {
        StringBuilder query = new StringBuilder("SELECT usuario ")
            .append("FROM UsuarioEntity usuario ")
            .append("WHERE usuario.identificador = :identificador ");
        TypedQuery<UsuarioEntity> typedQuery = this.entityManager.createQuery(query.toString(), UsuarioEntity.class);
            typedQuery.setParameter("identificador", identificador);
        return typedQuery.getSingleResult();
    }

}
