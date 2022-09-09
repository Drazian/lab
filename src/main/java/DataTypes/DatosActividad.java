package DataTypes;

import java.util.HashSet;

/**
 *
 * @author henry
 */
public class DatosActividad {
    private DataActividadDeportiva acDep;
    private HashSet<DataCuponera>cuponeras;
    private HashSet<DataClase>clases;
    DatosActividad(DataActividadDeportiva acDep,HashSet<DataCuponera>cuponeras,HashSet<DataClase>clases){
       this.acDep=acDep;
       this.cuponeras=cuponeras;
       this.clases=clases;
       
    };  
    public DataActividadDeportiva getDataActividadDeportiva(){
          return acDep;
    }
    public HashSet<DataCuponera> getcuponeras(){
          return cuponeras;
    }
    public HashSet<DataClase> getDataClase(){
          return clases;
    }
    
}
