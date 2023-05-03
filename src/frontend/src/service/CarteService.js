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

}


export default new CarteService()
