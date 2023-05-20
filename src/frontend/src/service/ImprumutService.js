import {AXIOS} from "@/Config/AxiosConfig";

class ImprumutService {
  postImprumut(form) {
    AXIOS
      .post('imprumut/imp', form)
      .then(() => {
        alert("Cartea a fost imprumutata!")
      })
      .catch(() => {
      })
  }

  deleteImprumut(id) {
    AXIOS
      .delete('imprumut/imp', {
        params: {
          id: Number(id)
        }
      })
      .then(() => {
        alert("Imprumutul a fost sters!")
        window.location.reload()
      })
      .catch(() => {
      })
  }

  getAllImprumut() {
    return AXIOS
      .get('imprumut/imp')
  }

}


export default new ImprumutService()
