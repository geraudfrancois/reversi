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

    public Integer save(Case case1) {
        final CaseBean caseBean = new CaseBean();
        caseBean.setX(case1.getX());
        return this.caseRepository.save(case.).getId();
    }

    public Case findById(Integer caseId){
        if(caseRepository.existsById(caseId)){
            return new Case(this.caseRepository.findById(caseId).get());
        }
        throw new IllegalArgumentException("No case found");
    }

    public Case position(int x, int y) {
        CaseBean example = new CaseBean();
        example.setX(x);
        example.setY(y);

        List<CaseBean> byId = this.caseRepository.findAll(Example.of(example));
        if (byId.size() == 1) {
            return new Case(x, y, byId.get(0).getColour());
        }
        throw new IllegalArgumentException("No case found at " + x + ", " + y);
    }
}
