package dk.kea.sem2.control;

import dk.kea.sem2.model.DTO.Assembler;
import dk.kea.sem2.model.DTO.Runde2DTO;
import dk.kea.sem2.model.DTO.ValgfagsDTO;
import dk.kea.sem2.model.DbFacade;
import dk.kea.sem2.model.Runde1;
import dk.kea.sem2.model.Runde2;
import dk.kea.sem2.model.Valgfag;
import java.util.ArrayList;
import java.util.Collection;


public class ValgfagsLogic {

    public Collection<ValgfagsDTO> listValgfagRunde1() {
        
        Collection<Valgfag> vfList = DbFacade.getInstance().listValgfagRunde1();
        Collection<ValgfagsDTO> vfDtoList = new ArrayList<>();
        
        for (Valgfag valgfag : vfList) {
           ValgfagsDTO vfTemp = Assembler.valgfagTilValgfagsDTO(valgfag);
           vfDtoList.add(vfTemp); 
        }
        return vfDtoList;
    }
    
    public Collection<Runde2DTO> listValgfagRunde2() {
        
        Collection<Runde2> r2List = DbFacade.getInstance().listValgfagRunde2();
        Collection<Runde2DTO> r2DtoList = new ArrayList<>();
        
        for (Runde2 r2 : r2List) {
           Runde2DTO r2Temp = Assembler.runde2TilRunde2DTO(r2);
           r2DtoList.add(r2Temp); 
        }
        return r2DtoList;
    }
    
    public Collection<ValgfagsDTO> listValgfagRunde1Resultat() {
        
        Collection<Valgfag> vfList = DbFacade.getInstance().listValgfagRunde1();
        Collection<ValgfagsDTO> vfDtoList = new ArrayList<>();
        
        for (Valgfag valgfag : vfList) {
           ValgfagsDTO vfTemp = Assembler.valgfagTilValgfagsDTO(valgfag);
           vfDtoList.add(vfTemp); 
        }
        return vfDtoList;
    }
}
