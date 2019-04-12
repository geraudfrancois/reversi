package fr.isima.cours.jee.server.business;

import fr.isima.cours.jee.server.model.Case;
import fr.isima.cours.jee.server.repository.CaseBean;
import fr.isima.cours.jee.server.repository.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.data.domain.Example;

import java.util.List;

@Component
public class CaseService {
    private final CaseRepository caseRepository;

    @Autowired
    public CaseService(CaseRepository caseRepository) {
        this.caseRepository = caseRepository;
    }

    public Integer save(Case c) {
        final CaseBean caseBean = new CaseBean();
        if(c.getId() != null){
            caseBean.setId(c.getId());
        }
        caseBean.setX(c.getX());
        caseBean.setY(c.getY());
        caseBean.setColour(c.getContent());
        caseBean.setIdgrille(c.getIdgrille());
        return this.caseRepository.save(caseBean).getId();
    }

    public Case findById(Integer caseId){
        if(caseRepository.existsById(caseId)){
            return new Case(this.caseRepository.findById(caseId).get());
        }
        throw new IllegalArgumentException("No case found");
    }

    public Case position(Integer x, Integer y, Integer idGrille) {
        CaseBean example = new CaseBean();
        example.setX(x);
        example.setY(y);
        example.setIdgrille(idGrille);

        List<CaseBean> byId = this.caseRepository.findAll(Example.of(example));
        if (byId.size() == 1) {
            return new Case(byId.get(0).getId(),x, y, byId.get(0).getColour(),example.getIdgrille());
        }
        throw new IllegalArgumentException("No case found at " + x + ", " + y);
    }

}
