import {AXIOS} from "@/Config/AxiosConfig";

class ImprumutService {
  postImprumut(form){
    AXIOS
      .post('imprumut/imp' , form)
      .then(() => {
        alert("Cartea a fost imprumutata")
      })
      .catch(() => {})
  }

}


export default new ImprumutService()
