/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Emprestimo;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Brendow
 */
public interface EmprestimoDao extends BaseDao<Emprestimo, Long> {
    
    List<Emprestimo> pesquisarEmprestimoPorCliente(Long id, Session sessao)throws HibernateException;
    
    
}