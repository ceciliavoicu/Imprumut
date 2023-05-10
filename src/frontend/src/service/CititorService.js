import {AXIOS} from "@/Config/AxiosConfig";

class CititorService {
  postCititor(form){
    AXIOS
      .post('cititor/imp' , form)
      .then(() => {
        alert("Cititorul a fost adaugat")
      })
      .catch(() => {})
  }

}


export default new CititorService()
