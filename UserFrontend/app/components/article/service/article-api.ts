import instance from "../../common/configs/axios-config"
import { IArticle } from "../model/article"

export const findAllArticlesAPI = async (page: number) =>{
    try{
        const response = await instance().get('/article/list',{
            params: {page, limit: 10}
        })
        return response.data
    }catch(error){
        console.log(error)
        return error
    }
    
}

export const findArticleByIdAPI = async (id: number) =>{
    try{
        const response = await instance().get('/article/detail',{
            params: {id}
        })
        return response.data
    }catch(error){
        console.log(error)
        return error
    }
    
}

export const getUserAPI = async (id: number) =>{
    try{
        const response = await instance().get('/',{
            params: {id}
        })
        return response.data
    }catch(error){
        console.log(error)
        return error
    }
    
}
export const findMyListAPI = async (id:number) =>{    
    try{                                                        
        const response = await instance().get('/article/myList',{
            params: {id}
        })
        return response.data
    }catch(error){
        console.log(error)
        return error
    }   
}
export const saveArticleAPI = async (article:IArticle) =>{
    try{
        const response = await instance().post('/article/save',article)
        //Java 에서 Messenger.message에 값을 담음
        console.log(response.data)
        console.log(article.boardId)
        return response.data
    }catch(error){
        console.log(error)
        return error
    }
    
}
