import {AXIOS} from "@/Config/AxiosConfig";

class CititorService {
  postCititor(form) {
    AXIOS
      .post('cititor/imp', form)
      .then(() => {
        alert("Cititorul a fost adaugat")
      })
      .catch(() => {
      })
  }

  getCititori() {
    return AXIOS
      .get('cititor/imp')
  }

  deleteStudent(id) {
    AXIOS
      .delete('cititor/imp', {
        params: {
          id: Number(id)
        }
      })
      .then(() => {
        alert("Cititorul a fost sters!")
        window.location.reload()
      })
      .catch(() => {
      })
  }

  getAllCititori() {
    return AXIOS
      .get('cititor/imp')
  }
}


export default new CititorService()
