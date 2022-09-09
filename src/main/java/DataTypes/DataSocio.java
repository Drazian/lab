package DataTypes;

import java.time.LocalDate;

public class DataSocio extends DataUsuario{
        public DataSocio(){}
        public DataSocio(String ni, String n, String ap, String ma, LocalDate f, LocalDate fc, String foto) {	
                super(ni, n, ap, ma, f, fc, foto);
	};
};