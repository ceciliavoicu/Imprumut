import {AXIOS} from "@/Config/AxiosConfig";

class CarteService {
  postCarte(form){
    AXIOS
      .post('carte/imp' , form)
      .then(() => {
        alert("Cartea a fost publicata")
      })
      .catch(() => {})
  }

  deleteCarte(id){
   AXIOS
     .delete('carte/imp' , {
     params:{
     id: Number(id)
     }
     })
     .then(() => {
       alert("Cartea a fost stearsa!")
       window.location.reload()
     })
     .catch(() => {})
  }

  getAllCarti(){
  return AXIOS
  .get('carte/imp')
  }
}


export default new CarteService()
