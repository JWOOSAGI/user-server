import { createAsyncThunk } from "@reduxjs/toolkit";
import { IArticle } from "../model/article";
import { findAllArticlesAPI, findArticleByIdAPI, findMyListAPI, saveArticleAPI} from "./article-api";
import axios from "axios";
import { API } from "@/app/components/common/enums/API";

export const findAllArticles: any = createAsyncThunk(
    'articles/findAllArticles',
    async (page: number)=>{
        console.log('fetchAllArticles page : '+ page)
        const data:any = await  findAllArticlesAPI(1);

        const {message, result}:any = data
        // console.log('----- API 를 사용한 경우 -----')
        // console.log('message : '+ message)
        // console.log(JSON.stringify(result))
        return data
    }
)

export const findArticleById: any = createAsyncThunk(
    'articles/findArticleById',
    async (id: number)=>{
        // console.log('fetchAllArticles page : '+ id)
        const data:any = await findArticleByIdAPI(id);
        // console.log('----- API 를 사용한 경우 -----')
        // console.log('message : '+ message)
        // console.log(JSON.stringify(result))
        return data
    }
)
export const findMyList: any = createAsyncThunk( 
    'articles/findMyList',                      
    async (id:number) => (await findMyListAPI(id))
)

export const saveArticle: any = createAsyncThunk(
    'articles/save',
    async (article : IArticle) => await saveArticleAPI(article)
)
